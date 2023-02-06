package fx.mastercalss.todolist;

import fx.mastercalss.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2016, Month.APRIL, 24));
        TodoItem item2 = new TodoItem("Doctors appointment", "See Dr. Smith at 123 Main Street",
                LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish desing proposal for client", "I promised Mike I'd emil website mockups by Friday",
                LocalDate.of(2016, Month.APRIL, 27));
        TodoItem item4 = new TodoItem("Pickup Doug at the train station", "Doug's arriving on March 22nd",
                LocalDate.of(2016, Month.MARCH, 22));
        TodoItem item5 = new TodoItem("Pick up dry cleaning", "The cloths should be ready by Wendsday",
                LocalDate.of(2016, Month.APRIL, 20));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

    }
}