#!/usr/bin/perl

# Usage: ./test.pl test1 test2 testn

use strict;

foreach  my $file (@ARGV) {
    if ($file =~ /(.*)\.not/) {
	my $base = $1;
	system("cd build; scala miniJS '../$file' > '../${base}.myout'");
	my $output = `diff '${base}.out' '${base}.myout'`;
	if ($output) {
	    print "File '$file' had errors:\n";
	    print $output;
	}
    }
}
