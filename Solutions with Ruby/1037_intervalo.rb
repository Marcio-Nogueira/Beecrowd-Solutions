number = gets.to_f

if number >= 0 && number <= 25
    puts 'Intervalo [0,25]'
elsif number > 25 && number <= 50
    puts 'Intervalo (25,50]'
elsif number > 50 && number <= 75
    puts 'Intervalo (50,75]'
elsif number > 75 && number <= 100
    puts 'Intervalo (75,100]'
else
    puts 'Fora de intervalo'
end
