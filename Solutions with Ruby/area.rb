input = gets.split

a = input[0].to_f
b = input[1].to_f
c = input[2].to_f

area_triangulo = (c * a)/2
area_circulo   = 3.14159 * c ** 2
area_trapezio  = ((a + b)/2) * c
area_quadrado  = b ** 2
area_retangulo = a * b

puts sprintf("TRIANGULO: %.3f", area_triangulo)
puts sprintf("CIRCULO: %.3f", area_circulo)
puts sprintf("TRAPEZIO: %.3f", area_trapezio)
puts sprintf("QUADRADO: %.3f", area_quadrado)
puts sprintf("RETANGULO: %.3f", area_retangulo)