# BoCo data insights

Boulder County publishes a variety of [property data](https://www.bouldercounty.org/property-and-land/assessor/data-download/), e.g. owners, addresses, permits, sales, etc.

This project persists this data in a Postgres database. The data will be enriched with lat/long, and will be made searchable by area (i.e. show all records that exist inside a specific polygon).

#### TODO:
* throttle API requests to avoid cost
* persist other data types (currently only captures building permits)

