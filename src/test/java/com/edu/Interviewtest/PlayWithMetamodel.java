package com.edu.Interviewtest;

import java.util.List;

import com.edu.Interviewtest.util.ColumnField;
import com.edu.Interviewtest.util.Metamodel;
import com.edu.Interviewtest.util.PrimaryKeyField;

public class PlayWithMetamodel {

    public static void main(String... args) {

        Metamodel<Person> metamodel = Metamodel.of(Person.class);

        PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
        List<ColumnField> columnFields = metamodel.getColumns();

        System.out.println("Primary key name = " + primaryKeyField.getName() +
                ", type = " + primaryKeyField.getType().getSimpleName());

        for (ColumnField columnField : columnFields) {
            System.out.println("Colum name = " + columnField.getName() +
                    ", type = " + columnField.getType().getSimpleName());
        }
    }
}
