// public class BasicOfClasses {

//     public static void main(String[] args) {
//         Maruti800 jhakas=new Maruti800("Red",1800,4,1900);
//         // jhakas.color="blue";
//         // jhakas.wheels=4;
//         // jhakas.engine=1200;
//         // jhakas.model=800;
//         System.out.println(jhakas.color);
//         System.out.println(jhakas.wheels);
//         System.out.println(jhakas.engine);
//         System.out.println(jhakas.model);
//         jhakas.move();
//         jhakas.location();
//     }
// static class Maruti800{
//         String color;
//         int wheels;
//         int engine;
//         int model;
//         public static void move()
//         {
//             System.out.println("Moving");
//         }
//         public static void location()
//         {
//             System.out.println("Location is Chitkara University");
//         }

//         Maruti800(){//! Constructor-non paramatrized
//             System.out.println("Constructor is called");
//         }
//         Maruti800(String color,int engine,int wheels,int model){//!parameterized                    
//             this.color=color;
//             this.engine=engine;
//             this.model=model;
//             this.wheels=wheels;
//         }

//     }
// }




public class  BasicOfClasses{
    public static void main(String[] args) {
        Maruti800 obj1=new Maruti800("Red",1970,2,1);
        Maruti800 obj2=new Maruti800(obj1);
        
        System.out.println("Color : "+obj1.color);
        System.out.println("Model : "+obj1.model);
        System.out.println("Wheels : "+obj1.wheels);
        System.out.println("Sitting : "+obj1.sitting);
        
        System.out.println();
        
        System.out.println("Color : "+obj2.color);
        System.out.println("Model : "+obj2.model);
        System.out.println("Wheels : "+obj2.wheels);
        System.out.println("Sitting : "+obj2.sitting);
        
    }
    
    
    static class Maruti800{
        String color;
        int model;
        int wheels;
        int sitting;
        
        Maruti800(String color,int model,int wheels,int sitting)
        {
            this.color=color;
            this.model=model;
            this.wheels=wheels;
            this.sitting=sitting;
        }
        
        Maruti800(Maruti800 obj1){  //copy constructor
            this.color=obj1.color;
            this.model=obj1.model;
            this.wheels=obj1.wheels;
            this.sitting=obj1.sitting;
        }
    }
}