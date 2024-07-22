// var a;
// console.log(a);
// console.log(b);
// a="Hello";
// let b="Hello";
// var a=20
// var a="Hello"
// console.log(a)
// greet();
// var greet=function(){
//     console.log("Hello world");
// }
// let a={
//     name:"Manan",
//     age:29,
//     greet: function ()
//     {
//         console.log("working...");
//     }
// }

// console.log(a.greet())

// function sayHello(){
//     console.log("Hi!");
// }

// function greet(callback)
// {
//     callback();
// }

// greet(sayHello);
// function performOperation(a,b,operation)
// {
//     return operation(a,b);
// }

// const add=function(x,y){
//     return x+y;
// };
// console.log(performOperation(5,3,add))          //output : 8
// var a=10;

// function outerfunction(){
//     var b=20;

//     function innerfunction(){
//         var c=30;
//         a=15;
//         console.log(a);
//         console.log(b);
//         console.log(c);
//     }
//     innerfunction();
// }

// outerfunction();
// let a = 10;

// function greet(){
//     console.log(a);
//     console.log(d);
//console.log(w);
//     var d = 25;
//     let w = "Hello";

//     function inner(){
//         console.log(d);
//         console.log(a);
//         console.log(b);
//         var b = 15;
//         let t = "MY";
//     }
//     inner();
// }
// greet();
// console.log(a);

// var a = 5;
// let b = 10;

// function test(){
// 	console.log(a);
// 	console.log(b);
// 	var a = 20;
// 	b = 30;
// 	function hello(){
// 		//console.log(c);
// 	    let c = null;
// 		//console.log(w);
// 	    var x = true;
// 	    console.log(b+a);
// 	    var b = 16;
// 	    console.log(b+a);
// 	}
// 	hello();
// }
// test();
// var c = 10;
// let d = 20;

// var bar = function () {
//     console.log(c);
//     console.log(d);
//     foo();
// }

// function foo() {
//     var a = 20;
//     console.log(c);
//     console.log(d);
// }

// bar();
// console.log(foo);
// var foo = "bar";

// console.log(baz);

// var baz = function () {
//     console.log("hello");
// }

// function qux() {
//     console.log("hi");
// }

// qux();
// (function foo(){
//     var a=20;
//     console.log(a);
//     console.log(a);
// })();
// (function(){
    //code 
// })();
// function makecounter() {
//     let count = 0;
//     console.log(count);
//     return function () {
//         count++;
//         console.log(count);
//     }
// }

// const counter1 = makecounter();
// const counter2 = makecounter();
// counter1();
// counter2();
// counter1();
// counter2();
// counter1();
// var obj = {
//     key1:"value1",
//     key2:"value2",
//     key3:function(){
//         return "Hello";
//     }
// };
// let person = Object.create(null);
// person.name="John";
// person.age=30;
// function abc(a,b,c){
//     console.log(this.age+a+b+c);
// }
// var obj={
//     age:24
// }


// var w = abc.bind(obj)
// w(1,2,3);
// function Person(name,age){
//     this.name=name;
//     this.age=age;
// }

// const person1=new Person('Alice',30);
// const person2=new Person('Bob',25);

// console.log(person1);
// console.log(person2);

// Person.prototype.greet=function(){
//     console.log(`Hello, my name is ${this.name} and I am ${this.age} years old`);
// };

// person1.greet();
// person2.greet();
