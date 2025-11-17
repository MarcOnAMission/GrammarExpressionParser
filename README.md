# Mini Grammar Parser

## Overview
This project is a small parsing application that reads lines from an `input.txt` file, tokenizes each line, and prints the resulting tokens. It forms the base for a simple grammar language that will later support variable declarations, arithmetic expressions, and printing values.

## Features
- Reads input from `input.txt`
- Tokenizes:
  - Numbers
  - Operators: `+`, `-`, `*`, `/`
  - Identifiers / keywords: `let`, `print`, variable names
- Skips whitespace
- Prints each token in a structured debug format

## How It Works

### Tokenizer
The Tokenizer scans each input line character by character and produces a list of Token objects. It supports:
- Multi-digit numbers
- Words (identifiers and keywords)
- Arithmetic operators
- Whitespace skipping

### Interpreter
The interpreter currently:
- Tokenizes each line from the input file
- Prints all tokens

### Input
The application reads from a file named `input.txt` in the project root.

Example `input.txt`:
let x = 5+3
print x
x + 10

### Example Output
Token(type=IDENTIFIER, keyword='let')
Token(type=IDENTIFIER, keyword='x')
Token(type=IDENTIFIER, keyword='=')
Token(type=NUMBER, value=5.0)
Token(type=ADDITION, operator='+')
Token(type=NUMBER, value=3.0)


## Project Files
- `Main.java` — entry point, reads `input.txt`
- `InterpertInput.java` — calls the tokenizer and prints tokens
- `Tokenizer.java` — converts text into tokens
- `Token.java` — structure for a token
- `Type.java` — enum for token types

## Future Extensions
- Add proper assignment token (`=`)
- Parse complete statements like `let x = 5 + 3`
- Implement an expression evaluator
- Add variables and environment mapping
- Build an AST for full language behavior

## Purpose
This project is the foundation for building your own tiny programming language from scratch.
