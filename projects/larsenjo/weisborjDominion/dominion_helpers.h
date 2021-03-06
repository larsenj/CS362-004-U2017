#ifndef _DOMINION_HELPERS_H
#define _DOMINION_HELPERS_H

#include "dominion.h"

int drawCard(int player, struct gameState *state);
int updateCoins(int player, struct gameState *state, int bonus);
int discardCard(int handPos, int currentPlayer, struct gameState *state,
		int trashFlag);
int gainCard(int supplyPos, struct gameState *state, int toFlag, int player);
int getCost(int cardNumber);
int cardEffect(int card, int choice1, int choice2, int choice3,
	       struct gameState *state, int handPos, int *bonus);
int smithy_effect(struct gameState *state, int handPos, int currentPlayer);
int adventurer_effect(struct gameState *state, int drawntreasure, int currentPlayer, int temphand[MAX_HAND], int z);
int feast_effect(struct gameState *state, int choice1, int currentPlayer, int temphand[]);
int council_room_effect(struct gameState *state, int currentPlayer, int handPos);
int salvager_effect(struct gameState *state, int choice1, int currentPlayer, int handPos);
#endif
