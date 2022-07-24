time = gets.to_i
speed = gets.to_i

distance = (time.to_f * speed.to_f / 12)

puts sprintf('%.3f', distance)
