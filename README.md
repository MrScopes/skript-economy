### early version of the plugin, treat it like an alpha

# skript-economy
Link a skript variable with vault to register as an economy provider.![img.png](img.png) in this image I have player -> player's uuid enabled in skript config ![img_1.png](img_1.png) auction house plugin working with it


# configuration
You can configure the variable in the config.yml:
```
# don't include {}
# default: balance::*
variable: balance::*

# use uuid over player's names, i.e. "balance::%player's uuid%" instead of "balance::%player%"
# this is recommended since users can change their name and they'll lose their balance if it isn't enabled
# default: true
use uuids: true
```
You can reload the config by restarting the plugin. I'd love to have a live reload but it doesn't seem to work.