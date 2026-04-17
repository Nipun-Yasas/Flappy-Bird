# Flappy Bird (Java Swing)

A simple Flappy Bird clone built with Java Swing.

## Features

- Real-time bird movement with gravity and jump controls
- Randomly generated top/bottom pipe obstacles
- Collision detection and game-over state
- Score tracking based on passed pipes
- Restart support using the space bar

## Project Structure

- src/App.java: entry point that creates the game window
- src/FlappyBird.java: game rendering, input, and game loop logic
- src/*.png: sprite assets (bird, background, pipes)
- bin/: compiled output

## Requirements

- Java 8 or newer

## Build and Run (Terminal)

From the project root:

```powershell
javac -d bin src\App.java src\FlappyBird.java
java -cp bin App
```

## Controls

- Space: flap
- Space after game over: restart

## Notes

- The game uses a Swing Timer running at roughly 60 FPS.
- Images are loaded as classpath resources, so keep the PNG files in src.
