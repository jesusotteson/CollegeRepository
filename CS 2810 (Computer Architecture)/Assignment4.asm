.data
	str1: .asciiz "Enter 3 numbers: "
	str2: .asciiz "\nThe largest value is "
	str3: .asciiz "\nThe smallest value is "
	sum: .asciiz "\nThe sum of the numbers is "
	diff: .asciiz "\nThe difference of the numbers is "
	divi: .asciiz "\nThe divided numbers are "
	multi: .asciiz "\nThe product of the numbers is "

.text
	main:
		la $a0 str1
		jal printstr
		
		li $v0 5 # Get the 3 numbers
		syscall
		add $t0 $zero $v0
		li $v0 5
		syscall
		add $t1 $zero $v0
		li $v0 5
		syscall
		add $t2 $zero $v0
		# END getting numbers
		
		# Calculate the sum
		la $a0 sum
		jal printstr
		
		li $v0 1
		add $t3 $t0 $t1
		add $a0 $t3 $t2
		syscall # Prints the sum
		
		# Calculate the difference
		la $a0 diff
		jal printstr
		
		li $v0 1
		sub $t3 $t0 $t1
		sub $a0 $t3 $t2
		syscall # Prints the difference
		
		# Calculate the product
		la $a0 multi
		jal printstr
		
		li $v0 1
		mul $t3 $t0 $t1
		mul $a0 $t3 $t2
		syscall # Calculate the product
		
		# Find the min
		add $t3 $t0 $zero
		blt $t3 $t1 exit
		add $t3 $t1 $zero
		exit:
		blt $t3 $t2 finish
		add $t3 $t2 $zero
		finish:
		la $a0 str3
		jal printstr
		li $v0 1
		add $a0 $t3 $zero
		syscall # Print the min
		
		# Find the max
		add $t3 $t0 $zero # Set t3 to the "max"
		bgt $t3 $t1 skip # If t4 = 1 then t0 is bigger than t1, so check t2 next
		add $t3 $t1 $zero # Else, t1 was bigger than t0 so make it the new max
		skip:
		bgt $t3 $t2 end 
		add $t3 $t2 $zero
		end:
		la $a0 str2
		jal printstr
		li $v0 1
		add $a0 $t3 $zero
		syscall # Print the max

		li $v0 10
		syscall # Quit (very important!)
	printstr:
		li $v0 4
		syscall
		jr $ra
