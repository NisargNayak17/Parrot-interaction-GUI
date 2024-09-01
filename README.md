# Parrot-interaction-GUI

## Overview
The parrot interaction GUI project is an interactive application developed using Java and IntelliJ IDEA IDE with a graphical user interface (GUI) built using JavaFX Scene. Users can engage parrot by performing actions such as hitting it, feeding it and monitoring its health and well-being. The game includes visual feedback through images and text, and allows players to start or quit the game.

## Features

- **Interactive Parrots**: Choose from three different parrots to play with.
- **Feed Parrot**: Enter the amount of cracker crumbs to feed the selected parrot and watch its health improve.
- **Hit Parrot**: Hit the parrot to decrease its health.
- **Start and Quit**: Begin the game with a selected parrot or quit and see a farewell message.
- **Visual Feedback**: Displays images and updates based on game actions and parrot status.

## How to Play

1. **Start the Game**:
   - Enter the number corresponding to the parrot you want to play with (1, 2, or 3).
   - Click the "Start" button to begin interacting with the selected parrot.
   
2. **Feed the Parrot**:
   - Enter the amount of cracker crumbs in the input field.
   - Click the "Feed" button to provide crumbs to the parrot.

3. **Hit the Parrot**:
   - Click the "Hit" button to reduce the parrot's health.

4. **Quit the Game**:
   - Click the "Quit" button to exit the game. A farewell message will be displayed, and an image will change to indicate that the game has ended.

## Components

- **Parrot Class**:
  - Represents a parrot with attributes like name, health, amount of cracker crumbs, and state.
  - Methods to feed, hit, and check the state and flying status of the parrot.

- **ParrotCraft Class**:
  - JavaFX application that provides a graphical interface for interacting with the parrot model.
  - Includes GUI components such as buttons, text fields, labels, and images to create an interactive experience.
    
- **ParrotCraft Class**:
  - JavaFX application that provides a graphical interface for interacting with the parrot model.
  - Includes GUI components such as buttons, text fields, labels, and images to create an interactive experience.

- **Images**:
  - **welcomeparrot.jpg**: Image displayed when the game starts.
  - **parrotwavingbyy.jpg**: Image displayed when the game is quit.

## Requirements

- Java Development Kit (JDK) 11 or later
- JavaFX SDK
