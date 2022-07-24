input = gets.to_i

minutes = input / 60
seconds = input % 60
hours = 0

while (minutes > 60) 
    hours += 1
    minutes -= 60
end

puts sprintf('%d:%d:%d', hours, minutes, seconds)