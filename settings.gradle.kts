rootProject.name = "ddd-study-delivery"

include(":server")
include(":shared")
include(":user-module")
include(
    ":user-module:user-domain",
)
include(":merchant-module")
include(
    ":merchant-module:merchant-domain",
)
include(":order-module")
include(
    ":order-module:order-domain",
)
include(":delivery-module")
include(
    ":delivery-module:delivery-domain",
)
