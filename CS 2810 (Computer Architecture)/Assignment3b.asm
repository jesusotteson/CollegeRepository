.data
	welcome: .asciiz "Formula F=(G+H)-(I+J)\n"
	intG: .asciiz "Enter int G: "
	intH: .asciiz "Enter int H: "
	intI: .asciiz "Enter int I: "
	intJ: .asciiz "Enter int J: "
	result: .asciiz " \nF = " 
	finish: .asciiz "\nProgram End" 

.text
# Print welcome message
li $v0,4
la $a0, welcome 
syscall

# Introducing int G
li $v0,4
la $a0, intG
syscall

# Read intG
li $v0,5
syscall

# the number is storage in $t0
move $t0,$v0

# Introducing int H
li $v0,4
la $a0, intH
syscall

# Read int H
li $v0,5
syscall

# the number is storage in $t1
move $t1,$v0

# Introducing int I
li $v0,4
la $a0, intI
syscall

# Read int I
li $v0,5
syscall

# the number is storage in $t2
move $t2,$v0

# Introducing int J
li $v0,4
la $a0, intJ
syscall

# Read int J
li $v0,5
syscall

# the number is storage in $t3
move $t3,$v0

#---------------------------------------------------------------------------------------------------------------------------------------->Jump to Leaf Example
jal leaf_example

#Show  the result
li,$v0,4
la,$a0, result
syscall

#print the result on the screen
li, $v0,1
move, $a0,$t6
syscall

# show a finish message
li,$v0,4
la,$a0, finish
syscall

#finish the program
li $v0,10
syscall

#---------------------------------------------------------------------------------------------------------------------------------------->Leaf Example
leaf_example:
# sum int G & int H and place in t4
add $t4,$t0,$t1

# sum int I & int J and place in t5
add $t5,$t2,$t3

# subtract (int G + int H) - (int I + int J) and place in t6
sub $t6,$t4,$t5

#Jump Back to Return Address
jr $ra