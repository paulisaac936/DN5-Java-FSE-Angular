public class TaskLinkedList {

    Node head;

    // Add Task
    void addTask(Task task) {

        Node newNode = new Node(task);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Traverse
    void displayTasks() {

        Node temp = head;

        while(temp != null) {

            System.out.println(
                temp.task.taskId + " " +
                temp.task.taskName + " " +
                temp.task.status
            );

            temp = temp.next;
        }
    }

    // Search
    void searchTask(int id) {

        Node temp = head;

        while(temp != null) {

            if(temp.task.taskId == id) {

                System.out.println(
                    "Found: " +
                    temp.task.taskName
                );

                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    // Delete
    void deleteTask(int id) {

        if(head == null)
            return;

        if(head.task.taskId == id) {
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null &&
              temp.next.task.taskId != id) {

            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        TaskLinkedList list =
            new TaskLinkedList();

        list.addTask(
            new Task(
                1,
                "Learn Java",
                "Pending"
            )
        );

        list.addTask(
            new Task(
                2,
                "Practice DSA",
                "In Progress"
            )
        );

        list.addTask(
            new Task(
                3,
                "GitHub Upload",
                "Pending"
            )
        );

        System.out.println("Tasks:");

        list.displayTasks();

        System.out.println();

        list.searchTask(2);

        list.deleteTask(2);

        System.out.println("\nAfter Delete:");

        list.displayTasks();
    }
}