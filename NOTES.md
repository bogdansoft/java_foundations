# Structure

![structure](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/classes%20with%20methods.png)

### Annotations

#### Entity
![entity](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Entity.png)

Application will scan package for any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the process of looking 
through that particular Java object to recreate it as a table in your database.

#### Table
![table](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Table.png)

For table names, use the @Table annotation and specify the actual name that you'd like to use for the table inside of it. This annotation should only be used at the class level.

#### Id
![id](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Id.png)

This annotation (@Id) is simple and it's used to “mark” the primary key for the table. This annotation should only be used at the field & method level.

#### Column
![column](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Column.png)

For column names, use the @Column annotation and specify the actual column name that you'd like to use inside of it. This annotation should only be used at field & method level. 

#### OneToMany
![one](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/OneToMany.png)

A one to many relationship can occur, if an entity is related to multiple occurrences in another entity. In simple terms, if one row in database table can 
be mapped to multiple rows in another table. This annotation should only be used at field & method level.

#### ManyToOne
![many](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/ManyToOne.png)

A many-to-one mapping means that many instances of this entity are mapped to one instance of another entity – many items in one cart. This annotation should only be used at field & method level.

### Custom exceptions

#### IdAlreadyExistException
![idex](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/IDAlreadyExc.png)

Throws if the object has id already set (except for String)

#### OrmFieldTypeException
![orm](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/OrmFieldEx.png)

Throws if Field is not correspondent type, used in the method getSqlTypeForField(Field field)
