# Start with OL runtime.
FROM open-liberty:full-java11-openj9

ARG VERSION=1.0
ARG REVISION=SNAPSHOT

LABEL \
  org.opencontainers.image.authors="reinier" \
  org.opencontainers.image.vendor="IBM" \
  org.opencontainers.image.url="local" \
  org.opencontainers.image.source="https://github.com/reiniervl/inara" \
  org.opencontainers.image.version="$VERSION" \
  org.opencontainers.image.revision="$REVISION" \
  vendor="Open Liberty" \
  name="system" \
  version="$VERSION-$REVISION" \
  summary="The system microservice from the Docker Guide" \
  description="This image contains the system microservice running with the Open Liberty runtime."

USER root

COPY --chown=1001:0 malcolm/src/main/liberty/config/server.xml /config/
COPY --chown=1001:0 malcolm/target/inara.ear /config/apps/
USER 1001