# httpunit
Patched httpunit

Copied from https://github.com/kohsuke/httpunit. Patched so that embedded JavaScript that returns a 500 error does not cause parsing of HTML to exit with exception. This library used by https://github.com/FundingCircle/us-blackbox/.
