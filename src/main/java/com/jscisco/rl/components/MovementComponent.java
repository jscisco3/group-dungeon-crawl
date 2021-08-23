package com.jscisco.rl.components;

import com.artemis.Component;
import com.jscisco.rl.domain.Position;

public class MovementComponent extends Component {
    private Position newPosition;

    public MovementComponent() {
    }

    public MovementComponent(Position newPosition) {
        this.newPosition = newPosition;
    }

    public Position getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(Position newPosition) {
        this.newPosition = newPosition;
    }
}
