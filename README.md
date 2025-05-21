# Chisel Mill Framework

This is a Chisel project template powered by [mill](https://com-lihaoyi.github.io/mill/).  
It provides a minimal setup to quickly get started with Chisel and mill-based builds, avoiding the verbosity and performance overhead of SBT.

## Project Structure

```text
chisel-framework/
├── build/                  # Verilog output and other generated files
├── build.mill              # Entry point for mill build
├── Makefile                # Simplifies common mill commands
└── src/                    # Source code and tests
    ├── main/scala/         # Chisel design sources
    │   ├── Elaborate.scala
    │   └── Hello.scala
    └── test/scala/         # Unit tests
    └── HelloSpec.scala
````

## Getting Started

### 1. Install mill

Follow the instructions at [https://com-lihaoyi.github.io/mill](https://com-lihaoyi.github.io/mill).

You can install mill globally:

```bash
curl -L https://github.com/com-lihaoyi/mill/releases/download/0.11.6/0.11.6 > mill && chmod +x mill
sudo mv mill /usr/local/bin/
````

Or use the local wrapper script `./mill` if present.

### 2. Build and Test

To run all Chisel tests (recommended for test-driven development):

```bash
make test
```

### 3. Generate Verilog

To elaborate your Chisel design and generate Verilog files:

```bash
make verilog
```

Output will be placed in the `build/` directory.

### 4. Formatting

To reformat your Scala code using `scalafmt`:

```bash
make format
```

Ensure you have a `.scalafmt.conf` file in the root directory.

### 5. Miscellaneous

Install BSP support for editors:

```bash
make bsp
```

Generate IntelliJ project files:

```bash
make idea
```

Clean the generated build artifacts:

```bash
make clean
```

## Notes

* This template uses Chisel 7 and ChiselTest 6.
* If you encounter formatting issues, make sure your `scalafmt` version is compatible with Scala 2.13 and your `.scalafmt.conf` is correctly configured.
* The project structure avoids SBT and uses mill for faster incremental builds and simpler configuration.
