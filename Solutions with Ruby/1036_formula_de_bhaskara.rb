input = gets.split
a = input[0].to_f
b = input[1].to_f
c = input[2].to_f

delta = b**2 - 4 * a * c


if a == 0 || delta < 0 
    puts 'Impossivel calcular'
else
    r1 = (-b + Math.sqrt(delta)) / (2 * a)
    r2 = (-b - Math.sqrt(delta)) / (2 * a)
    puts sprintf('R1 = %.5f', r1)
    puts sprintf('R2 = %.5f', r2)
end

