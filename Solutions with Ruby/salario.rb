numero_funcionario = gets.chomp.to_i
horas_trabalhadas = gets.chomp.to_i
salario_hora = gets.chomp.to_f

salario = horas_trabalhadas * salario_hora

puts "NUMBER = #{numero_funcionario}"
puts sprintf('SALARY = U$ %.2f', salario)

