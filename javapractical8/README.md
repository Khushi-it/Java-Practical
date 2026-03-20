import java.util.Scanner;

class Book
{
    int code;
    String name;
    String date;

    void setBook(int c, String n, String d)
    {
        code = c;
        name = n;
        date = d;
    }

    void displayBook()
    {
        System.out.println("Book Code: " + code);
        System.out.println("Book Name: " + name);
        System.out.println("Date of Issue: " + date);
        
    }
}

class Library
{
    Book b[] = new Book[5];
    int count = 0;

    Scanner sc = new Scanner(System.in);

    void addBook()
    {
        if(count < 5)
        {
            Book bk = new Book();

            System.out.print("Enter Book Code: ");
            int c = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String n = sc.nextLine();

            System.out.print("Enter Date (DD/MM/YYYY): ");
            String d = sc.nextLine();

            bk.setBook(c, n, d);

            b[count] = bk;
            count++;

            System.out.println("Book Added Successfully");
        }
        else
        {
            System.out.println("Library is Full");
        }
    }

    void displayBooks()
    {
        if(count == 0)
        {
            System.out.println("No Books Available");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                b[i].displayBook();
            }
        }
    }
}

public class LMS
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Library lib = new Library();

        int choice;

        do
        {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    lib.addBook();
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 3);
    }
}






