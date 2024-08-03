package se.emancipe.lab;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.*;
import picocli.CommandLine.Model.*;

@Command(name = "gar", mixinStandardHelpOptions = true, version = "gar 1.0.0-SNAPSHOT", description = "a GRF archiving utility.")
class Gar implements Callable<Integer> {
    @Spec
    CommandSpec spec;

    @Option(names = { "--concatenate" }, description = "Append archives to the end of another archive.")
    boolean concatenate;

    @Option(names = { "--create" }, description = "Create a new archive.")
    boolean create;

    @Option(names = { "--diff" }, description = "Find differences between archive and file system.")
    boolean diff;

    @Option(names = { "--delete" }, description = "Delete from the archive.")
    boolean delete;

    @Option(names = { "--append" }, description = "Append files to the end of an archive.")
    boolean append;

    @Option(names = { "--list" }, description = "List the contents of an archive.")
    boolean list;

    @Option(names = { "--extract" }, description = "Extract files from an archive.")
    boolean extract;

    @Option(names = { "--help" }, usageHelp = true, description = "Display this help message.")
    boolean help;

    @Option(names = { "--version" }, versionHelp = true, description = "Display version information and exit.")
    boolean version;

    @Override
    public Integer call() throws Exception {
        return 0;
    }

    public static void main(String[] args) {
        System.exit(new CommandLine(new Gar()).execute(args));
    }
}
