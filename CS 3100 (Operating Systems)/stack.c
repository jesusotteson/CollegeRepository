#include "stack.h"

#include <stdlib.h>

#include <stdio.h>

stackT *NewStack(void)
{
    stackT *new_stack = malloc(  sizeof(stackT)  );
    new_stack->head = NULL;
    return new_stack;
}

void Push(stackT *stack, valueT value)
{
    if(stack->head == NULL) { //stack is empty
        nodeT *new_node = malloc( sizeof(nodeT) ); // define container for new value
        new_node->next = NULL;
        new_node->value = value;
        stack->head = new_node; //set head
    } else { //stack isn't empty
        nodeT *new_node = malloc( sizeof(nodeT) ); // define container for new value
        new_node->value = value;
        new_node->next = stack->head; //let new head point to old head
        stack->head = new_node; //set new head as head
    }
}

valueT Pop(stackT *stack)
{
   if (stack->head == NULL) {
        printf("Error, this thing empty. ");
        return 0 ;
    } else {
        nodeT *pop_node = stack->head; //set pointer to current head
        valueT pop_node_value = pop_node->value;
        stack->head = stack->head->next; //point next head to head
        free(pop_node); //free pop_node unallocates memory
        return pop_node_value;
    }
}

void EmptyStack(stackT *stack)
{

    int pop_return_value = -1;
    while(stack->head!=NULL) {
        pop_return_value = Pop(stack);
    } 
    while(pop_return_value != 0);

    while (Pop(stack) != 0);

    free(stack);
    stack = NULL;
}

void FreeStack(stackT *stack)
{
    free(stack);
}

bool IsEmpty(stackT *stack)
{
    if(stack->head == NULL) return true;
    else return false;
}
