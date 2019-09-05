package com.dylanvann.fastimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.RequestOptions;
import java.lang.Class;
import java.lang.Cloneable;
import java.lang.Override;
import java.lang.SafeVarargs;
import java.lang.SuppressWarnings;

/**
 * Automatically generated from {@link com.bumptech.glide.annotation.GlideExtension} annotated classes.
 *
 * @see RequestOptions
 */
@SuppressWarnings("deprecation")
public final class GlideOptions extends RequestOptions implements Cloneable {
  private static GlideOptions fitCenterTransform0;

  private static GlideOptions centerInsideTransform1;

  private static GlideOptions centerCropTransform2;

  private static GlideOptions circleCropTransform3;

  private static GlideOptions noTransformation4;

  private static GlideOptions noAnimation5;

  /**
   * @see RequestOptions#sizeMultiplierOf(float)
   */
  @CheckResult
  @NonNull
  public static GlideOptions sizeMultiplierOf(@FloatRange(from = 0.0, to = 1.0) float value) {
    return new GlideOptions().sizeMultiplier(value);
  }

  /**
   * @see RequestOptions#diskCacheStrategyOf(DiskCacheStrategy)
   */
  @CheckResult
  @NonNull
  public static GlideOptions diskCacheStrategyOf(@androidx.annotation.NonNull DiskCacheStrategy strategy) {
    return new GlideOptions().diskCacheStrategy(strategy);
  }

  /**
   * @see RequestOptions#priorityOf(Priority)
   */
  @CheckResult
  @NonNull
  public static GlideOptions priorityOf(@androidx.annotation.NonNull Priority priority) {
    return new GlideOptions().priority(priority);
  }

  /**
   * @see RequestOptions#placeholderOf(Drawable)
   */
  @CheckResult
  @NonNull
  public static GlideOptions placeholderOf(@Nullable Drawable drawable) {
    return new GlideOptions().placeholder(drawable);
  }

  /**
   * @see RequestOptions#placeholderOf(int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions placeholderOf(@DrawableRes int id) {
    return new GlideOptions().placeholder(id);
  }

  /**
   * @see RequestOptions#errorOf(Drawable)
   */
  @CheckResult
  @NonNull
  public static GlideOptions errorOf(@Nullable Drawable drawable) {
    return new GlideOptions().error(drawable);
  }

  /**
   * @see RequestOptions#errorOf(int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions errorOf(@DrawableRes int id) {
    return new GlideOptions().error(id);
  }

  /**
   * @see RequestOptions#skipMemoryCacheOf(boolean)
   */
  @CheckResult
  @NonNull
  public static GlideOptions skipMemoryCacheOf(boolean skipMemoryCache) {
    return new GlideOptions().skipMemoryCache(skipMemoryCache);
  }

  /**
   * @see RequestOptions#overrideOf(int, int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions overrideOf(@IntRange(from = 0) int value0,
      @IntRange(from = 0) int value1) {
    return new GlideOptions().override(value0, value1);
  }

  /**
   * @see RequestOptions#overrideOf(int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions overrideOf(@IntRange(from = 0) int value) {
    return new GlideOptions().override(value);
  }

  /**
   * @see RequestOptions#signatureOf(Key)
   */
  @CheckResult
  @NonNull
  public static GlideOptions signatureOf(@androidx.annotation.NonNull Key key) {
    return new GlideOptions().signature(key);
  }

  /**
   * @see RequestOptions#fitCenterTransform()
   */
  @CheckResult
  @NonNull
  public static GlideOptions fitCenterTransform() {
    if (GlideOptions.fitCenterTransform0 == null) {
      GlideOptions.fitCenterTransform0 =
          new GlideOptions().fitCenter().autoClone();
    }
    return GlideOptions.fitCenterTransform0;
  }

  /**
   * @see RequestOptions#centerInsideTransform()
   */
  @CheckResult
  @NonNull
  public static GlideOptions centerInsideTransform() {
    if (GlideOptions.centerInsideTransform1 == null) {
      GlideOptions.centerInsideTransform1 =
          new GlideOptions().centerInside().autoClone();
    }
    return GlideOptions.centerInsideTransform1;
  }

  /**
   * @see RequestOptions#centerCropTransform()
   */
  @CheckResult
  @NonNull
  public static GlideOptions centerCropTransform() {
    if (GlideOptions.centerCropTransform2 == null) {
      GlideOptions.centerCropTransform2 =
          new GlideOptions().centerCrop().autoClone();
    }
    return GlideOptions.centerCropTransform2;
  }

  /**
   * @see RequestOptions#circleCropTransform()
   */
  @CheckResult
  @NonNull
  public static GlideOptions circleCropTransform() {
    if (GlideOptions.circleCropTransform3 == null) {
      GlideOptions.circleCropTransform3 =
          new GlideOptions().circleCrop().autoClone();
    }
    return GlideOptions.circleCropTransform3;
  }

  /**
   * @see RequestOptions#bitmapTransform(Transformation)
   */
  @CheckResult
  @NonNull
  public static GlideOptions bitmapTransform(@androidx.annotation.NonNull Transformation<Bitmap> transformation) {
    return new GlideOptions().transform(transformation);
  }

  /**
   * @see RequestOptions#noTransformation()
   */
  @CheckResult
  @NonNull
  public static GlideOptions noTransformation() {
    if (GlideOptions.noTransformation4 == null) {
      GlideOptions.noTransformation4 =
          new GlideOptions().dontTransform().autoClone();
    }
    return GlideOptions.noTransformation4;
  }

  /**
   * @see RequestOptions#option(Option, T)
   */
  @CheckResult
  @NonNull
  public static <T> GlideOptions option(@androidx.annotation.NonNull Option<T> option,
      @androidx.annotation.NonNull T t) {
    return new GlideOptions().set(option, t);
  }

  /**
   * @see RequestOptions#decodeTypeOf(Class)
   */
  @CheckResult
  @NonNull
  public static GlideOptions decodeTypeOf(@androidx.annotation.NonNull Class<?> clazz) {
    return new GlideOptions().decode(clazz);
  }

  /**
   * @see RequestOptions#formatOf(DecodeFormat)
   */
  @CheckResult
  @NonNull
  public static GlideOptions formatOf(@androidx.annotation.NonNull DecodeFormat format) {
    return new GlideOptions().format(format);
  }

  /**
   * @see RequestOptions#frameOf(long)
   */
  @CheckResult
  @NonNull
  public static GlideOptions frameOf(@IntRange(from = 0) long value) {
    return new GlideOptions().frame(value);
  }

  /**
   * @see RequestOptions#downsampleOf(DownsampleStrategy)
   */
  @CheckResult
  @NonNull
  public static GlideOptions downsampleOf(@androidx.annotation.NonNull DownsampleStrategy strategy) {
    return new GlideOptions().downsample(strategy);
  }

  /**
   * @see RequestOptions#timeoutOf(int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions timeoutOf(@IntRange(from = 0) int value) {
    return new GlideOptions().timeout(value);
  }

  /**
   * @see RequestOptions#encodeQualityOf(int)
   */
  @CheckResult
  @NonNull
  public static GlideOptions encodeQualityOf(@IntRange(from = 0, to = 100) int value) {
    return new GlideOptions().encodeQuality(value);
  }

  /**
   * @see RequestOptions#encodeFormatOf(CompressFormat)
   */
  @CheckResult
  @NonNull
  public static GlideOptions encodeFormatOf(@androidx.annotation.NonNull Bitmap.CompressFormat format) {
    return new GlideOptions().encodeFormat(format);
  }

  /**
   * @see RequestOptions#noAnimation()
   */
  @CheckResult
  @NonNull
  public static GlideOptions noAnimation() {
    if (GlideOptions.noAnimation5 == null) {
      GlideOptions.noAnimation5 =
          new GlideOptions().dontAnimate().autoClone();
    }
    return GlideOptions.noAnimation5;
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float value) {
    return (GlideOptions) super.sizeMultiplier(value);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions useUnlimitedSourceGeneratorsPool(boolean flag) {
    return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(flag);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions useAnimationPool(boolean flag) {
    return (GlideOptions) super.useAnimationPool(flag);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions onlyRetrieveFromCache(boolean flag) {
    return (GlideOptions) super.onlyRetrieveFromCache(flag);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions diskCacheStrategy(@androidx.annotation.NonNull DiskCacheStrategy strategy) {
    return (GlideOptions) super.diskCacheStrategy(strategy);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions priority(@androidx.annotation.NonNull Priority priority) {
    return (GlideOptions) super.priority(priority);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions placeholder(@Nullable Drawable drawable) {
    return (GlideOptions) super.placeholder(drawable);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions placeholder(@DrawableRes int id) {
    return (GlideOptions) super.placeholder(id);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions fallback(@Nullable Drawable drawable) {
    return (GlideOptions) super.fallback(drawable);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions fallback(@DrawableRes int id) {
    return (GlideOptions) super.fallback(id);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions error(@Nullable Drawable drawable) {
    return (GlideOptions) super.error(drawable);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions error(@DrawableRes int id) {
    return (GlideOptions) super.error(id);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions theme(@Nullable Resources.Theme theme) {
    return (GlideOptions) super.theme(theme);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions skipMemoryCache(boolean skip) {
    return (GlideOptions) super.skipMemoryCache(skip);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions override(int width, int height) {
    return (GlideOptions) super.override(width, height);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions override(int size) {
    return (GlideOptions) super.override(size);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions signature(@androidx.annotation.NonNull Key key) {
    return (GlideOptions) super.signature(key);
  }

  @Override
  @androidx.annotation.CheckResult
  public final GlideOptions clone() {
    return (GlideOptions) super.clone();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final <T> GlideOptions set(@androidx.annotation.NonNull Option<T> option,
      @androidx.annotation.NonNull T t) {
    return (GlideOptions) super.set(option, t);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions decode(@androidx.annotation.NonNull Class<?> clazz) {
    return (GlideOptions) super.decode(clazz);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions encodeFormat(@androidx.annotation.NonNull Bitmap.CompressFormat format) {
    return (GlideOptions) super.encodeFormat(format);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions encodeQuality(@IntRange(from = 0, to = 100) int value) {
    return (GlideOptions) super.encodeQuality(value);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions frame(@IntRange(from = 0) long value) {
    return (GlideOptions) super.frame(value);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions format(@androidx.annotation.NonNull DecodeFormat format) {
    return (GlideOptions) super.format(format);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions disallowHardwareConfig() {
    return (GlideOptions) super.disallowHardwareConfig();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions downsample(@androidx.annotation.NonNull DownsampleStrategy strategy) {
    return (GlideOptions) super.downsample(strategy);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions timeout(@IntRange(from = 0) int value) {
    return (GlideOptions) super.timeout(value);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions optionalCenterCrop() {
    return (GlideOptions) super.optionalCenterCrop();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions centerCrop() {
    return (GlideOptions) super.centerCrop();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions optionalFitCenter() {
    return (GlideOptions) super.optionalFitCenter();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions fitCenter() {
    return (GlideOptions) super.fitCenter();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions optionalCenterInside() {
    return (GlideOptions) super.optionalCenterInside();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions centerInside() {
    return (GlideOptions) super.centerInside();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions optionalCircleCrop() {
    return (GlideOptions) super.optionalCircleCrop();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions circleCrop() {
    return (GlideOptions) super.circleCrop();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions transform(@androidx.annotation.NonNull Transformation<Bitmap> transformation) {
    return (GlideOptions) super.transform(transformation);
  }

  @Override
  @SafeVarargs
  @SuppressWarnings("varargs")
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions transforms(@androidx.annotation.NonNull Transformation<Bitmap>... transformations) {
    return (GlideOptions) super.transforms(transformations);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions optionalTransform(@androidx.annotation.NonNull Transformation<Bitmap> transformation) {
    return (GlideOptions) super.optionalTransform(transformation);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final <T> GlideOptions optionalTransform(@androidx.annotation.NonNull Class<T> clazz,
      @androidx.annotation.NonNull Transformation<T> transformation) {
    return (GlideOptions) super.optionalTransform(clazz, transformation);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final <T> GlideOptions transform(@androidx.annotation.NonNull Class<T> clazz,
      @androidx.annotation.NonNull Transformation<T> transformation) {
    return (GlideOptions) super.transform(clazz, transformation);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions dontTransform() {
    return (GlideOptions) super.dontTransform();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions dontAnimate() {
    return (GlideOptions) super.dontAnimate();
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public final GlideOptions apply(@androidx.annotation.NonNull RequestOptions options) {
    return (GlideOptions) super.apply(options);
  }

  @Override
  @androidx.annotation.NonNull
  public final GlideOptions lock() {
    return (GlideOptions) super.lock();
  }

  @Override
  @androidx.annotation.NonNull
  public final GlideOptions autoClone() {
    return (GlideOptions) super.autoClone();
  }
}
