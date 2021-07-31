package com.jscisco.rl.components;

import com.artemis.Component;
import com.jscisco.rl.domain.Position;

public class PositionComponent extends Component {
    Position position;

    public PositionComponent() {
    }

    public PositionComponent(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
