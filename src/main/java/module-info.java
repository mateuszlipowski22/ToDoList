module fx.mastercalss.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens fx.mastercalss.todolist to javafx.fxml;
    exports fx.mastercalss.todolist;
}