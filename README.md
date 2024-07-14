# Quest Reward Generator

This project generates a string of rewards for quests in the "Idle Outpost" game. Each quest can have one of two types of rewards: either a bronze chest or a silver chest, denoted as “b” and “s” respectively. The distribution of these rewards mimics a given pattern, with bronze chests being more common at the beginning and silver chests becoming more frequent towards the end.

## Table of Contents

- [Quest Reward Generator](#quest-reward-generator)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
  - [Usage](#usage)

## Features

- Generates a deterministic sequence of rewards based on a given number of quests.
- Smoothly transitions from a high probability of bronze chests to a high probability of silver chests.

## Getting Started

### Prerequisites

Ensure you have the following installed on your local machine:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Git](https://git-scm.com/)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/SuzyKostumyan/quest-reward-generator.git
    ```

2. Navigate to the project directory:

    ```bash
    cd quest-reward-generator
    ```

## Usage

To generate a string of rewards for a given number of quests, you can run the `Main` class.

1. Open the project in your IDE (e.g., IntelliJ IDEA).
2. Run the `Main` class.

Alternatively, you can compile and run the project from the command line:

1. Compile the project:

    ```bash
    javac -d out src/*.java
    ```

2. Run the project:

    ```bash
    java -cp out Main
    ```    

    
