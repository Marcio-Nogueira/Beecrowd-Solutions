funcionario = gets.chomp
salario = gets.chomp.to_f
total_vendas = gets.chomp.to_f

rendimento = salario + (total_vendas * 0.15)

puts sprintf('TOTAL = R$ %.2f', rendimento)
