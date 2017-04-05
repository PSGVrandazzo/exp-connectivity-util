swagger-codegen generate \
   -i swagger.json \
   -l java \
   --invoker-package com.expedia.lct.eps.sdk.product \
   --api-package com.expedia.lct.eps.sdk.product.api \
   --model-package com.expedia.lct.eps.sdk.product.model \
   --artifact-id product \
   --artifact-version 2.0.0 \
   --group-id com.expedia.lct.eps.sdk \
   -o java/product-sdk
