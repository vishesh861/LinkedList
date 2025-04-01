package MachineCoding.SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class SnakeGame extends JPanel implements KeyListener {
    private static final int BOARD_WIDTH = 400;
    private static final int BOARD_HEIGHT = 400;
    private static final int SNAKE_SIZE = 20;
    private static final int FOOD_SIZE = 20;
    private int[] snakeX = new int[100];
    private int[] snakeY = new int[100];
    private int snakeLength = 5;
    private int foodX;
    private int foodY;
    private char direction = 'R'; // R, L, U, D
    private boolean gameOver = false;
    private Random random = new Random();
    private Timer timer;
    public SnakeGame() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        initGame();
        startGame();
    }
    private void initGame() {
        for (int i = 0; i < snakeLength; i++) {
            snakeX[i] = 100 - i * SNAKE_SIZE;
            snakeY[i] = 100;
        }
        generateFood();
    }
    private void generateFood() {
        foodX = random.nextInt(BOARD_WIDTH / FOOD_SIZE) * FOOD_SIZE;
        foodY = random.nextInt(BOARD_HEIGHT / FOOD_SIZE) * FOOD_SIZE;
    }
    private void startGame() {
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGameState();
                repaint();
            }
        });
        timer.start();
    }
    private void updateGameState() {
        if (gameOver) {
            return;
        }
        // Update snake position
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
        switch (direction) {
            case 'R':
                snakeX[0] += SNAKE_SIZE;
                break;
            case 'L':
                snakeX[0] -= SNAKE_SIZE;
                break;
            case 'U':
                snakeY[0] -= SNAKE_SIZE;
                break;
            case 'D':
                snakeY[0] += SNAKE_SIZE;
                break;
        }
        // Check for collisions
        if (snakeX[0] < 0 || snakeX[0] >= BOARD_WIDTH || snakeY[0] < 0 || snakeY[0] >= BOARD_HEIGHT) {
            gameOver = true;
        }
        for (int i = 1; i < snakeLength; i++) {
            if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                gameOver = true;
                break;
            }
        }
        // Check for food consumption
        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            generateFood();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameOver) {
            g.setColor(Color.WHITE);
            g.drawString("Game Over!", 150, 200);
        } else {
            g.setColor(Color.WHITE);
            for (int i = 0; i < snakeLength; i++) {
                g.fillRect(snakeX[i], snakeY[i], SNAKE_SIZE, SNAKE_SIZE);
            }
            g.setColor(Color.RED);
            g.fillRect(foodX, foodY, FOOD_SIZE, FOOD_SIZE);
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    direction = 'U';
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    direction = 'D';
                }
                break;
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    direction = 'R';
                }
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
