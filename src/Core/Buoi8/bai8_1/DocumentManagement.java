package Core.Buoi8.bai8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManagement {
    List<Document> documents = new ArrayList<>();

    public DocumentManagement() {}
    public DocumentManagement(List<Document> documents) {
        this.documents = new ArrayList<>();
        this.documents = documents;
    }

    //getter, setter
    public List<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> addDocuments() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input type of document(book/ journal/ newspaper): ");
        String typeDocument = scr.nextLine();

        System.out.print("Input ID: ");
        String id = scr.nextLine();

        System.out.print("Input name of publisher: ");
        String publisher = scr.nextLine();

        System.out.print("Input release number: ");
        int releaseNum = scr.nextInt();

        if (typeDocument.equalsIgnoreCase("book")) {
            scr.nextLine();
            System.out.print("Input author: ");
            String author = scr.nextLine();

            System.out.print("Input number of page: ");
            int numPage = scr.nextInt();

            Document book = new Book(id, publisher, releaseNum, author, numPage);
            documents.add(book);
        }
        else if (typeDocument.equalsIgnoreCase("journal")) {
            System.out.print("Input issue number: ");
            int issueNum = scr.nextInt();
            
            System.out.print("Input month issue: ");
            int monthIssue = scr.nextInt();

            Document journal = new Journal(id, publisher, releaseNum, issueNum, monthIssue);
            documents.add(journal);
        }
        else if (typeDocument.equalsIgnoreCase("newspaper")) {
            System.out.print("Input day issue: ");
            int dayIssue = scr.nextInt();

            Document newspaper = new Newspaper(id, publisher, releaseNum, dayIssue);
            documents.add(newspaper);
        }
        return documents;
    }

    public void informationOfDocument() {
        for (int i = 0; i < documents.size(); i++) {
            Document a = documents.get(i);
            if (a instanceof Book) {
                Book b = (Book) a;
                System.out.println(b.toString());
            } else if (documents.get(i) instanceof Journal) {
                Journal b = (Journal) a;
                System.out.println(b.toString());
            } else if (documents.get(i) instanceof Newspaper) {
                Newspaper b = (Newspaper) a;
                System.out.println(b.toString());
            }
        }
    }

    public String deleteDocument() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input ID document which you wanna remove: ");
        String id = scr.nextLine();
        int flag = 5;
        for (int i = 0; i < documents.size(); i++) {
            if (id.equalsIgnoreCase(documents.get(i).getId())) {
                documents.remove(i);
            }
        }
        return "Your document id " + id + " removed " + flag;
    }

    public void searchType() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input type document(book/ journal/ newspaper): ");
        String typeOfDocument = scr.nextLine();

        switch (typeOfDocument) {
            case ("book"):
                for (int i = 0; i < documents.size(); i++) {
                    Document a = documents.get(i);
                    if (a instanceof Book) {
                        Book b = (Book) a;
                        System.out.println(b.toString());
                    }
                }
                break;

            case ("journal"):
                for (int i = 0; i < documents.size(); i++) {
                    Document a = documents.get(i);
                    if (documents.get(i) instanceof Journal) {
                        Journal b = (Journal) a;
                        System.out.println(b.toString());
                    }
                }    
                break;

            case ("newspaper"):
                for (int i = 0; i < documents.size(); i++) {
                    Document a = documents.get(i);
                    if (documents.get(i) instanceof Newspaper) {
                        Newspaper b = (Newspaper) a;
                        System.out.println(b.toString());
                    }
                break;
                }
        }
    }
    
}
