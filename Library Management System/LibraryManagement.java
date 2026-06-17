public class LibraryManagement {

    // Linear Search
    static int linearSearch(Book[] books,
                            String target) {

        for(int i = 0; i < books.length; i++) {

            if(books[i].title.equals(target)) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    static int binarySearch(Book[] books,
                            String target) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                books[mid].title.compareTo(target);

            if(result == 0)
                return mid;

            else if(result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Book[] books = {

            new Book(
                101,
                "Algorithms",
                "Cormen"
            ),

            new Book(
                102,
                "Database",
                "Korth"
            ),

            new Book(
                103,
                "Java",
                "Herbert"
            ),

            new Book(
                104,
                "Python",
                "Mark"
            )
        };

        int index =
            linearSearch(books, "Java");

        if(index != -1) {

            System.out.println(
                "Found using Linear Search:"
            );

            books[index].display();
        }

        index =
            binarySearch(books, "Java");

        if(index != -1) {

            System.out.println(
                "\nFound using Binary Search:"
            );

            books[index].display();
        }
    }
}