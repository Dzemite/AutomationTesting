package org.mytests.enums;

import com.epam.commons.linqinterfaces.JAction;
import com.epam.jdi.uitests.core.preconditions.IPreconditions;
import com.google.common.base.Supplier;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.alwaysMoveToCondition;
import static org.mytests.uiobjects.epam.EpamSite.homepage;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public enum States implements IPreconditions {
    LOGGED_IN(() -> homepage.isLoggedIn(),
                () -> homepage.login()),
    LOGGED_OUT(() -> ! homepage.isLoggedIn(),
                () -> homepage.logout());

    public Supplier<Boolean> checkAction;
    public JAction moveToAction;

    States(Supplier<Boolean> checkAction, JAction moveToAction) {
        this.checkAction = checkAction;
        this.moveToAction = moveToAction;
        alwaysMoveToCondition = true;
    }

    public Boolean checkAction() { return checkAction.get();}
    public void moveToAction() { moveToAction.invoke(); }
}
