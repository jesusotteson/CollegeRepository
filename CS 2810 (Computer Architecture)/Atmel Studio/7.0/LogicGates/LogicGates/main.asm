;
; And-OrGAte.asm
;
; Created: 10/9/2018 8:21:49 PM
; Author : hmoykwan
;




.include "m328pdef.inc"              ; Library/Libreria en assembler para el micro ATmega8
.org $0000

 .def var = r16

 rjmp INIT

 INIT:
 ldi var,0xf0   ; High level Output- Low level Input/salida nivel alto - entradas nivel bajo
 out DDRD,var   
 sbi PORTD,0
 ldi var,0x0f   ; High level input-Low level output/entradas nibble alto - salidas nibble bajo
 out DDRB,var
 sbi PORTD,2

 start:
  ; turn off or turn on the output PB2 GATE AND INPUT in PIN 0 (PD0) and PIN 1 (PD1) /apaga o prende la salida PB2 COMPUERTA ADN ENTRADA EN PIN 0 (PD0) Y PIN 1 (PD1)
  sbis PIND,0            ; test if the input is pressed otherwise the following statement is made/ prueba si esta presionada la entrada de no ser así realiza la sentencia siguiente
  rjmp CERO_B2 
  sbis PIND,1            ; test if the input is pressed otherwise the following statement is made/ prueba si esta presionada la entrada de no ser así realiza la sentencia siguiente
  rjmp CERO_B2 
  sbi    PORTB,2
  rjmp siguiente
  
  CERO_B2:
  cbi    PORTB,2
  
 siguiente:
 ; turn off or turn on the output PD4 GATE OR Input IN PIN 2 (PD2) and PIN 3 (PD3)/ apaga o prende la salida PD4 COMPUERTA OR ENTRADA EN PIN 2 (PD2) Y PIN 3 (PD3)
  sbic PIND,2           ; test if the input is pressed otherwise the following statement is made/ prueba si esta presionada la entrada de ser así realiza la sentencia siguiente
  rjmp UNO_D4 
  sbic PIND,3            ; test if the input is pressed otherwise the following statement is made/ prueba si esta presionada la entrada de ser así realiza la sentencia siguiente
  rjmp UNO_D4 
  cbi PORTD,4
  rjmp start 
 
  UNO_D4:
  sbi    PORTD,4
  rjmp start   

