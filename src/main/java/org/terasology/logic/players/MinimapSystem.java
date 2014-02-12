/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.logic.players;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.ComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.input.binds.minimap.DecreaseOffsetButton;
import org.terasology.input.binds.minimap.IncreaseOffsetButton;
import org.terasology.input.binds.minimap.ToggleMinimapAxisButton;
import org.terasology.input.binds.minimap.ToggleMinimapButton;
import org.terasology.logic.characters.CharacterComponent;
import org.terasology.minimap.rendering.nui.layers.MinimapHUDElement;
import org.terasology.registry.In;
//import org.terasology.rendering.nui.ControlWidget;
import org.terasology.rendering.nui.NUIManager;

/**
 * @author mkienenb
 */
@RegisterSystem
public class MinimapSystem implements ComponentSystem {

    public static final String HUD_ELEMENT_MAP_ID = "minimap";

    private MinimapHUDElement minimapHUDElement;

    @In
    private NUIManager nuiManager;

    @Override
    public void initialise() {
        // TODO: get rid of return value assignment when findHUDElementWidget is in engine
        minimapHUDElement = (MinimapHUDElement) nuiManager.getHUD().addHUDElement(HUD_ELEMENT_MAP_ID);
    }

    @Override
    public void shutdown() {
    }

    @ReceiveEvent(components = {CharacterComponent.class})
    public void onToggleMinimapButton(ToggleMinimapButton event, EntityRef entity) {
        if (event.isDown()) {
            //            ControlWidget element = nuiManager.getHUD().findHUDElementWidget(HUD_ELEMENT_MAP_ID);
            //            if (null != element) {
            //                MinimapHUDElement minimapHUDElement = (MinimapHUDElement) element;
            {
                // TODO: get rid of return value assignment when findHUDElementWidget is in engine
                minimapHUDElement.setVisible(!minimapHUDElement.isVisible());
            }

            event.consume();
        }
    }

    @ReceiveEvent(components = {CharacterComponent.class})
    public void onIncreaseOffsetButton(IncreaseOffsetButton event, EntityRef entity) {
        if (event.isDown()) {
            //            ControlWidget element = nuiManager.getHUD().findHUDElementWidget(HUD_ELEMENT_MAP_ID);
            //            if (null != element) {
            //                MinimapHUDElement minimapHUDElement = (MinimapHUDElement) element;
            {
                // TODO: get rid of return value assignment when findHUDElementWidget is in engine
                minimapHUDElement.onBindEvent(event);
            }

            event.consume();
        }
    }

    @ReceiveEvent(components = {CharacterComponent.class})
    public void onDecreaseOffsetButton(DecreaseOffsetButton event, EntityRef entity) {
        if (event.isDown()) {
            //            ControlWidget element = nuiManager.getHUD().findHUDElementWidget(HUD_ELEMENT_MAP_ID);
            //            if (null != element) {
            //                MinimapHUDElement minimapHUDElement = (MinimapHUDElement) element;
            {
                // TODO: get rid of return value assignment when findHUDElementWidget is in engine
                minimapHUDElement.onBindEvent(event);
            }

            event.consume();
        }
    }

    @ReceiveEvent(components = {CharacterComponent.class})
    public void onToggleMinimapAxisButton(ToggleMinimapAxisButton event, EntityRef entity) {
        if (event.isDown()) {
            //            ControlWidget element = nuiManager.getHUD().findHUDElementWidget(HUD_ELEMENT_MAP_ID);
            //            if (null != element) {
            //                MinimapHUDElement minimapHUDElement = (MinimapHUDElement) element;
            {
                // TODO: get rid of return value assignment when findHUDElementWidget is in engine
                minimapHUDElement.onBindEvent(event);
            }

            event.consume();
        }
    }

    @Override
    public void preBegin() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postBegin() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void preSave() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postSave() {
        // TODO Auto-generated method stub
        
    }
}
