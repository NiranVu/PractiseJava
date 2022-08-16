package Core.Buoi8.bai8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManagement {
    List<Document> documents;

    public DocumentManagement() {}

    public DocumentManagement(List<Document> documents) {
        this.documents = new ArrayList<>();
        this.documents = documents;
    }

    //getter, setter
    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {this.documents = documents;}

    public List<Document> addDocuments() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input type of document(book/ journal/ newspaper): ");
        String typeDocument = scr.nextLine();

        System.out.print("Input ID: ");
        String id = scr.nextLine();

        System.out.print("Input name of publisher: ");
        String publisher = scr.nextLine();

        System.out.print("Input release number: ");
        int releaseNum = scr.nextInt();

        switch (typeDocument) {
            case ("book"):
                scr.nextLine();
                System.out.println("Input author: ");
                String author = scr.nextLine();

                System.out.println("Input number of page: ");
                int numPage = scr.nextInt();

                Book books = new Book(id, publisher, releaseNum, author, numPage);
                documents.add(books);
                break;
            case ("journal"):
                System.out.println("Input issue number: ");
                int issueNum = scr.nextInt();
                
                System.out.println("Input month issue: ");
                int monthIssue = scr.nextInt();

                Journal journals = new Journal(id, publisher, releaseNum, issueNum, monthIssue);
                documents.add(journals);
                break;
            case ("newspaper"):
                System.out.println("Input day issue: ");
                int dayIssue = scr.nextInt();

                Newspaper newspapers = new Newspaper(id, publisher, releaseNum, dayIssue);
                documents.add(newspapers);
                break;
        }
        return documents;
    }

    public void informationOfDocument() {
        for (int i = 0; i < documents.size(); i++) {
            Document a = documents.get(i);
            if (a instanceof Book) {
                Book b = (Book)a;
                System.out.println("ID: " + b.getId() + 
                "name of publisher: " + b.getPublisher() + 
                "release day: " + b.getReleaseNum() + 
                "Author: " + b.getAuthor() + 
                "Number of page: " + b.getNumPage());
            } else if (documents.get(i) instanceof Journal) {
                Journal b = (Journal)a;
                System.out.println("ID: " + b.getId() + 
                "name of publisher: " + b.getPublisher() + 
                "release day: " + b.getReleaseNum() + 
                "issue number: " + b.getIssueNum() + 
                "month issue" + b.getMonthIssue());
            } else if (documents.get(i) instanceof Newspaper) {
                Newspaper b = (Newspaper)a;
                System.out.println("ID: " + b.getId() + 
                "name of publisher: " + b.getPublisher() + 
                "release day: " + b.getReleaseNum() + 
                "day issue: " + b.getDayIssue());
            }
        }
    }

    public String deleteDocument() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input ID document which you wanna remove: ");
        String id = scr.nextLine();
        for (int i = 0; i < documents.size(); i++) {
            if (id == documents.get(i).getId()) {
                documents.remove(i);
            }
        }
        return "Your document id" + id + "removed";
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
                        Book b = (Book)a;
                        System.out.println("ID: " + b.getId() + 
                        "name of publisher: " + b.getPublisher() + 
                        "release day: " + b.getReleaseNum() + 
                        "Author: " + b.getAuthor() + 
                        "Number of page: " + b.getNumPage());
                    }
                }
                break;

            case ("journal"):
                for (int i = 0; i < documents.size(); i++) {
                    Document a = documents.get(i);
                    if (documents.get(i) instanceof Journal) {
                        Journal b = (Journal)a;
                        System.out.println("ID: " + b.getId() + 
                        "name of publisher: " + b.getPublisher() + 
                        "release day: " + b.getReleaseNum() + 
                        "issue number: " + b.getIssueNum() + 
                        "month issue" + b.getMonthIssue());
                    }
                }    
                break;

            case ("newspaper"):
                for (int i = 0; i < documents.size(); i++) {
                    Document a = documents.get(i);
                    if (documents.get(i) instanceof Newspaper) {
                        Newspaper b = (Newspaper)a;
                        System.out.println("ID: " + b.getId() + 
                        "name of publisher: " + b.getPublisher() + 
                        "release day: " + b.getReleaseNum() + 
                        "day issue: " + b.getDayIssue());
                    }
                break;
                }
        }
    }
    
}
