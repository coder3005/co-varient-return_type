/* co-varient return_type */
class A 
{
    A show()
    {
        System.out.println("Abhi Gupta");
        return new A();  // this --> new A();
    }
}
class B extends A 
{
    @Override
    B show()
    {
        super.show();  /* if we didn't write this then, in output 'Abhi Gupta' will not print */
        System.out.println("Please Like");
        return new B();  // this --> new B();
    }
}
class test
{
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
