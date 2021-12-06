--Calculadora con funciones lambda 
--Sergio Luis Huanca Cuellar
--INF -319 2do Parcial
--Pregunta 2

--entrada de datos
getnum::IO Int
getnum = do
  s <- getLine
  return (read s)
--funcuin calculladora
calc = do
-- calculadora funciones
  putStrLn("****CALCULADORA EN HASKELL LAMBDA****")
  putStr("1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n>\n")
  opc <- getnum
  putStr("Numero 1:\n")
  n1 <- getnum
  putStr("Numero 2:\n")
  n2 <- getnum
  
  --funioens lambda suma, resta mul, divi
  let suma =[c+d | c <- [n1], d <- [n2]]
  let resta = [c-d | c <- [n1], d <- [n2]]
  let multiplica=[c*d | c <- [n1], d <- [n2]]
  let divide=[c `div` d | c <- [n1], d <- [n2]]
  --resultado
  let resultado= if opc==1 then suma else if opc==2 then resta else if opc==3 then multiplica else if opc==4 then divide else []
  --muestra resultado
  putStr("Resultado:"++show(resultado)++"\n")
  
  
  
  