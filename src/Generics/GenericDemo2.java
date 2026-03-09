package Generics;
//Generics is the type maintaining the type safety with all compile time and run time executions
class Test<T>{
    T obj;
    Test(T obj) { //creating constructor and passing T type function
    this.obj=obj;//this is maintaining the type safety same type is running throughout
    }
}       //this is own generic class constructor to mentain throught the class
class Driver{
    static void main(String[] args) {
        Test<Integer> obj1=new Test<>(15);//can pass any data type because it is general
        Test<String> obj2=new Test<>("234");//the whole "class Test<T>{T obj;Test(T obj) { this.obj=obj;}}" this is converted to java integer and now it is mentaining the type safety
    }
}