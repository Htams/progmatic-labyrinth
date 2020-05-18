package com.progmatic.labyrinthproject.interfaces;

import com.progmatic.labyrinthproject.enums.Direction;

import java.util.Random;

public class RandomPlayer implements Player {


    @Override
    public Direction nextMove(Labyrinth l) {
        return l.possibleMoves().get(new Random().nextInt(l.possibleMoves().size()));
    }
}

