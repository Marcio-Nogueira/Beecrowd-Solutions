input = gets.split
a = input[0].to_i
b = input[1].to_i
c = input[2].to_i
d = input[3].to_i

if b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a.even? == true 
     puts "Valores aceitos" 
else
     puts "Valores nao aceitos"
end

       