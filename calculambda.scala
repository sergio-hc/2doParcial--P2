//Calculadora con funciones lambda en Scala
//Sergio Luis Huanca Cuellar
//Segundo Parcial - problema 2

object calculambda {
  //lambda suma 
  val suma: (Int,Int) => Int = (x,y) => x + y
  //lambda de la resta  
  val res: (Int,Int) => Int = (x,y) => x - y
    //lambda de la mul
  val mul: (Int,Int) => Int = (x,y) => x * y
    //lambda de la divi 
  val div: (Int,Int) => Int = (x,y) => if(y == 0) {-1} else {x / y}
  
 //fun calcular
 def calcu(x:Int, y:Int, operacion:String):Int={
  operacion match {
  case "suma"=>suma(x,y)
  case "resta"=>res(x,y)
  case "multi"=>mul(x,y)
  case "divi"=>div(x,y)
  case _ => -1
  }
} 
 
def main(args: Array[String]):Unit = {
  println("*****CALCULADORA EN SCALA CON LAMBDA******")
  //valores
  val a = 20
  val b = 8
  println("Los valores a operar son: "+ a +","+ b)
//suma
  println("Suma: "+ calcu(a,b,"suma")) // numero a operar  4 5 
//resta
  println("Resta: "+ calcu(a,b,"resta"))
  //multi
  println("Multiplicacion: "+ calcu(a,b,"multi"))
  //divi
  println("Division: "+ calcu(a,b,"divi"))
} 
 
}