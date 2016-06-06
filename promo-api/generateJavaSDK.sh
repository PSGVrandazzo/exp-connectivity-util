swagger-codegen generate \
   -i swagger.json \
   -l java \
   --invoker-package com.expedia.lct.eps.sdk.promo \
   --api-package com.expedia.lct.eps.sdk.promo.api \
   --model-package com.expedia.lct.eps.sdk.promo.model \
   --artifact-id promo \
   --artifact-version 1.0.0 \
   --group-id com.expedia.lct.eps.sdk \
   -o java/promo-sdk
