# Structure

![structure](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/classes%20with%20methods.png)

### Annotations

#### Entity
![entity](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Entity.png)

Hibernate will scan that package for any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the process of looking 
through that particular Java object to recreate it as a table in your database!

#### Table
![table](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Table.png)

#### Id
![id](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Id.png)

#### Column
![column](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/Column.png)

#### OneToMany
![one](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/OneToMany.png)

#### ManyToOne
![many](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/ManyToOne.png)

### Custom exceptions

#### IdAlreadyExistException
![idex](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/IDAlreadyExc.png)

Throws if the object has id already set (except for String)

#### OrmFieldTypeException
![orm](https://github.com/bogdansoft/java_foundations/blob/master/src/main/resources/images/OrmFieldEx.png)

Throws if Field is not correspondent type, used in the method getSqlTypeForField(Field field)
