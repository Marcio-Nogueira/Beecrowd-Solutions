input = gets.split
x1 = input[0].to_f
y1 = input[1].to_f
input2 = gets.split
x2 = input2[0].to_f
y2 = input2[1].to_f

distancia = Math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

puts sprintf("%.4f", distancia)
