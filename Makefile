BUILD_DIR = ./build

PRJ = HelloTest
SSRC += $(shell find src/main/scala src/test/scala -name "*.scala")

test:
	mill -i $(PRJ).test

verilog:
	mkdir -p $(BUILD_DIR)
	mill -i $(PRJ).runMain Elaborate --target-dir $(BUILD_DIR)

help:
	mill -i $(PRJ).runMain Elaborate --help

# reformat:
# 	mill -i __.reformat

# checkformat:
# 	mill -i __.checkFormat

format:
	scalafmt --config .scalafmt.conf $(SSRC)

bsp:
	mill -i mill.bsp.BSP/install

idea:
	mill -i mill.idea.GenIdea/idea

clean:
	-rm -rf $(BUILD_DIR)

.PHONY: test verilog help format clean

sim:
	@echo "Write this Makefile by yourself."
