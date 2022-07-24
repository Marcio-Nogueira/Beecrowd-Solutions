input = gets.to_i
year = 0
month = 0

while input >= 365
    year += 1
    input -= 365
end
while input >= 30
    month += 1
    input -= 30
end

puts "#{year} ano(s)"
puts "#{month} mes(es)"
puts "#{input} dia(s)"

