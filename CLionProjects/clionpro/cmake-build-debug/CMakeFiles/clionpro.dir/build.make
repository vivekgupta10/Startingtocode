# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.12

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2018.2.4\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2018.2.4\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\Coding\CLionProjects\clionpro

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\Coding\CLionProjects\clionpro\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/clionpro.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/clionpro.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/clionpro.dir/flags.make

CMakeFiles/clionpro.dir/testing.cpp.obj: CMakeFiles/clionpro.dir/flags.make
CMakeFiles/clionpro.dir/testing.cpp.obj: ../testing.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\Coding\CLionProjects\clionpro\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/clionpro.dir/testing.cpp.obj"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\clionpro.dir\testing.cpp.obj -c D:\Coding\CLionProjects\clionpro\testing.cpp

CMakeFiles/clionpro.dir/testing.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/clionpro.dir/testing.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E D:\Coding\CLionProjects\clionpro\testing.cpp > CMakeFiles\clionpro.dir\testing.cpp.i

CMakeFiles/clionpro.dir/testing.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/clionpro.dir/testing.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S D:\Coding\CLionProjects\clionpro\testing.cpp -o CMakeFiles\clionpro.dir\testing.cpp.s

# Object files for target clionpro
clionpro_OBJECTS = \
"CMakeFiles/clionpro.dir/testing.cpp.obj"

# External object files for target clionpro
clionpro_EXTERNAL_OBJECTS =

clionpro.exe: CMakeFiles/clionpro.dir/testing.cpp.obj
clionpro.exe: CMakeFiles/clionpro.dir/build.make
clionpro.exe: CMakeFiles/clionpro.dir/linklibs.rsp
clionpro.exe: CMakeFiles/clionpro.dir/objects1.rsp
clionpro.exe: CMakeFiles/clionpro.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\Coding\CLionProjects\clionpro\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable clionpro.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\clionpro.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/clionpro.dir/build: clionpro.exe

.PHONY : CMakeFiles/clionpro.dir/build

CMakeFiles/clionpro.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\clionpro.dir\cmake_clean.cmake
.PHONY : CMakeFiles/clionpro.dir/clean

CMakeFiles/clionpro.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\Coding\CLionProjects\clionpro D:\Coding\CLionProjects\clionpro D:\Coding\CLionProjects\clionpro\cmake-build-debug D:\Coding\CLionProjects\clionpro\cmake-build-debug D:\Coding\CLionProjects\clionpro\cmake-build-debug\CMakeFiles\clionpro.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/clionpro.dir/depend

