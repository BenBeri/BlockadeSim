package com.benberi.cadesim.game.entity.vessel;

import com.benberi.cadesim.GameContext;
import com.benberi.cadesim.game.entity.vessel.impl.WarBrig;
import com.benberi.cadesim.game.entity.vessel.impl.WarFrigate;

public class VesselFactory {

    private static final int warBrig = 2;
    private static final int warFrig = 3;

    public static Vessel create(GameContext context, String name, int x, int y, int type) {
        switch (type) {
            case warBrig:
                return new WarBrig(context, name, x, y);
            case warFrig:
                return new WarFrigate(context, name, x, y);
        }

        return new WarFrigate(context, name, x, y);
    }
}